package com.tca.entities.login;

import com.tca.exceptions.InvalidLogin;

import java.io.*;

public class Login {
    private String userID;
    private String userName;
    private String password;
    static private FileReader loginDataBaseFile;

    static {
        try {
            String path = "/home/omkar/Documents/omkar/SE_JAVA_(core)/01_JAVA_intelliJ_IDEA/06FileHandling/MyCodes/01StudentLogin/src/com/tca/loginDataBase.txt";

            if( !  ( new File(path).isFile() )   ){
                throw new FileNotFoundException("Given Path is not a File");
            }

            loginDataBaseFile = new FileReader(path);

            System.out.println("--File Opened Successfully!!--\n");

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException + " + e.getLocalizedMessage() + "\n using Default loginDataBaseFile = null!! ");
            loginDataBaseFile = null;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public boolean validateLogin(String enteredUsername, String enteredPassword){

        boolean found=false;
        BufferedReader br = new BufferedReader( loginDataBaseFile );

        while(true){

            String loginInfoLine=null;

            try {
                loginInfoLine = br.readLine();
            } catch (IOException e) {
                System.out.println("IOException Occured During Reading line from File :" + e.getMessage());
                e.printStackTrace();
            }
            catch (Exception e){
                System.out.println("Exception Occured During Reading line from File :" + e.getMessage());
            }

            if(loginInfoLine == null){
                found = false;
                break;
            }

            String loginInfo[] = loginInfoLine.split(" ");
            if( loginInfo[1].equals(enteredUsername) && loginInfo[2].equals(enteredPassword) ){
                found = true;
                break;
            }
        }
        try {
            br.close();
        }
        catch (IOException e){
            System.out.println("IOException Occured Closing br !!!! " + e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException Occured Closing br !!!! " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception Occured Closing br !!!! " + e.getMessage());
        }

        try {
            if(found == false){
                throw new InvalidLogin("Username & Password Does Not Match!!!");
            }
        }
        catch (InvalidLogin e){
            System.out.println(e.getMessage());
        }
        finally {
            return found;
        }
    }


    static public void closeLoginDataBaseFile() {
        try {
            loginDataBaseFile.close();
            System.out.println("\n--FIle Closed Successfully!!! --");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException!! "+e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Exception Occured Closing loginDataBaseFile !!!! " + e.getMessage());
//            e.printStackTrace();
        }
    }


}
