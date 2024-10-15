package com.tca;

import com.tca.entities.Login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfUsers = 1;

        Login []loginInfos = new Login[numberOfUsers];

        //Sign Up
        System.out.println("\n-- Sign Up First Time Login --\n");
        for (int i = 0; i < loginInfos.length; i++) {
            try {
                loginInfos[i] = new Login();
                loginInfos[i].setName(getStringInput(br, "Enter Username : "));
                loginInfos[i].setPassword(getStringInput(br, "Enter Password : "));
            }
            catch (NullPointerException npe){
                System.out.println("NullPointerException Occured !!!!! " + npe.getMessage());
                // npe.printStackTrace();
            }
            catch (Exception e) {
                System.out.println("Unknown Exception Occured!!! " + e.getMessage());
                // e.printStackTrace();
            }

        }
        System.out.println();

        displayUserInfo(loginInfos);



        try{
            br.close();
        }
        catch (IOException ioe) {
            System.out.println("IOException Occured During Closing BufferedReader!!! " + ioe.getMessage());
            // ioe.printStackTrace();
        }

    }

    public static void displayUserInfo(Login []loginInfos){
        System.out.println("\n-- User Infos --\n");
        for (int i = 0; i < loginInfos.length; i++) {
            try {
                System.out.println("UserName : " + loginInfos[i].getName());
                System.out.println("Password : " + loginInfos[i].getPassword());
            }
            catch (NullPointerException npe){
                System.out.println("NullPointerException Occured !!!!! " + npe.getMessage());
                // npe.printStackTrace();
            }
            catch (Exception e) {
                System.out.println("Unknown Exception Occured!!! " + e.getMessage());
                // e.printStackTrace();
            }
        }
    }

    public static String getStringInput(BufferedReader br, String msg) {
        while(true) {
            try{
                System.out.print(msg);
                return br.readLine();
            }
            catch (IOException ioe) {
                System.out.println("IOException Occured During Reading Input!!! " + ioe.getMessage());
                // ioe.printStackTrace();
            }
            catch (Exception e) {
                System.out.println("Unknown Exception Occured!!! " + e.getMessage());
                // e.printStackTrace();
            }
        }
    }

}