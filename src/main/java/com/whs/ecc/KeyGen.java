package com.whs.ecc;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class KeyGen {

	public static PublicKey getPubKey() throws NoSuchProviderException, NoSuchAlgorithmException, NoSuchPaddingException {
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC", "SunEC");
        //kpg.initialize(128);
        System.out.println(kpg.getAlgorithm());
        //Cipher cipher = Cipher.getInstance("EC", "SunEC");
        //Cipher cipher = Cipher.getInstance("DES");
        //System.out.println("provider=" + cipher.getProvider());

        //ECGenParameterSpec ecsp = new ECGenParameterSpec("sect163r2");   //sect163r2
        kpg.initialize(256);   //ecsp
        KeyPair kyp = kpg.genKeyPair();
        
        
        //PublicKey pubKey = kyp
        PublicKey pubKey = kyp.getPublic();
        
        return pubKey;
	}
	
	public static PrivateKey getPriKey() throws NoSuchProviderException, NoSuchAlgorithmException, NoSuchPaddingException {
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC", "SunEC");
        //kpg.initialize(128);
        System.out.println(kpg.getAlgorithm());
        //Cipher cipher = Cipher.getInstance("EC", "SunEC");
        //Cipher cipher = Cipher.getInstance("DES");
        //System.out.println("provider=" + cipher.getProvider());

        //ECGenParameterSpec ecsp = new ECGenParameterSpec("sect163r2");   //sect163r2
        kpg.initialize(256);   //ecsp
        KeyPair kyp = kpg.genKeyPair();
        
        
        PrivateKey priKey = kyp.getPrivate();
        
        return priKey;
	}
	
	public static void main( String[] args ){
		try {
			System.out.println("Pub Key ["+getPubKey()+"]");
			System.out.println("Pri Key ["+getPriKey()+"]");
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
