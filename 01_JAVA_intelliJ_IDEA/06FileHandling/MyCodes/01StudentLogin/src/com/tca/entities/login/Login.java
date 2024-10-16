package com.tca.entities.login;

import com.tca.exceptions.InvalidLogin;
import com.tca.exceptions.UserAlreadyExistsException;

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

    public boolean validateLogin(String enteredUsername, String enteredPassword) throws InvalidLogin {

        boolean found = false;
        BufferedReader br = new BufferedReader(loginDataBaseFile);            //Creating Object to read line from file
        String loginInfosLine = null;

        try {
            while ((loginInfosLine = br.readLine()) != null) {
                String[] loginIfo = loginInfosLine.split(" ");
                if (loginIfo.length == 3 && loginIfo[1].equals(enteredUsername) && loginIfo[2].equals(enteredPassword)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("IOException occurred during reading from file: " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("IOException Occured While br.close [used for read line from file] " + e.getMessage());
            }
        }

        if (!found) {
            throw new InvalidLogin("Username & Password Does Not Match!!!");
        }

        return found;
    }



    public boolean signUp(String enteredUsername, String enteredPassword){
        boolean isUserExists = false;

        try{
            if(userExist((enteredUsername))){
                isUserExists = false;
            }
        }
        catch (UserAlreadyExistsException e){

        }
    }






    //Checking If the user is already exist or not
    public boolean userExist(String userName)throws UserAlreadyExistsException{
        boolean found = false;
        BufferedReader br = new BufferedReader(loginDataBaseFile);            //Creating Object to read line from file
        String loginInfosLine = null;

        try {
            while ((loginInfosLine = br.readLine()) != null) {
                String[] loginIfo = loginInfosLine.split(" ");
                if (loginIfo.length == 3 && loginIfo[1].equals(userName) ) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("IOException occurred during reading from file: " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("IOException Occured While br.close [used for read line from file] " + e.getMessage());
            }
        }

        if (!found) {
            throw new UserAlreadyExistsException("UserAlreadyExistsException : " + userName);
        }

        return found;
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
