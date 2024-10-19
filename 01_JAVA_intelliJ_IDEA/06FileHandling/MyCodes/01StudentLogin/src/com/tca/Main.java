package com.tca;

import com.tca.entities.login.SerializableLogin;
import com.tca.extend.AppendableObjectOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SerializableLogin ob1s = new SerializableLogin("omkar","om@");
        SerializableLogin ob1d = null;


        SerializableLogin ob2s = new SerializableLogin("vaibhav","vk@");
        SerializableLogin ob2d = null;

        String path = "src/com/tca/loginDataBase.txt";


        serialization(ob1s,path);
        serialization(ob2s,path);

        System.out.println();

        List<Object> usersData = deSerialization(path);

        for ( Object obj : usersData ){
            if(obj instanceof SerializableLogin){
                System.out.println((SerializableLogin)obj);
            }
            else {
                System.out.println("Unexpected object type: " + obj.getClass());
            }
        }

    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static void serialization(Object ob, String path){
        ObjectOutputStream oos = null;

        //Creating object to Add record in give file path
        //if Object is not null then the data will add successfully in give file path
        try {
            File file = new File(path);
            if(file.exists() && file.length() > 0 && !file.isDirectory()){
                oos = new AppendableObjectOutputStream( new FileOutputStream(path, true) );
            }
            else {
                oos = new ObjectOutputStream( new FileOutputStream(path) );
            }
            oos.writeObject(ob);
            System.out.println("Data Added Successfully : "+ob);
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException Occured in serialization!!! :" + e.getMessage());
        }
        catch (IOException e){
            System.out.println("IOException Occured in serialization!!! :" + e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Exception Occured in serialization!!! :" + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try{
                oos.close();
            }
            catch (Exception e){
                System.out.println("Exception Occured in serialization!!![oos.close()] :" + e.getMessage());
                e.printStackTrace();
            }
        }
    }




    @SuppressWarnings("CallToPrintStackTrace")
    public static List<Object> deSerialization(String path){

        List<Object> retObj = new ArrayList<>();

        try ( ObjectInputStream ois = new ObjectInputStream( new FileInputStream( path ) ) )
        {
            while (true) {
                try {
                    retObj.add(ois.readObject());
                } catch (EOFException e) {
                    break;
                }
                catch (ClassNotFoundException e){
                    System.out.println("ClassNotFoundException : " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e) {
            System.out.println("IOException Occured in deSerialization!!![ois.readObject()] :" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception Occured in deSerialization!!![ois.readObject()] :" + e.getMessage());
            e.printStackTrace();
        }


        return retObj;
    }

}