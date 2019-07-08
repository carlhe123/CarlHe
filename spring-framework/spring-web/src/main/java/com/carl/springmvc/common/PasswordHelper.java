package com.carl.springmvc.common;

import com.carl.springmvc.beans.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class PasswordHelper {
	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

	@Value("md5")
	private String algorithmName = "md5";

	@Value("1024")
	private int hashIterations = 1024;

	public void setRandomNumberGenerator(
			RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

	public String encryptPassword(User user) {
		String password = user.getUserPassword() == null ? "" : user.getUserPassword();
		ByteSource passwordSalt = ByteSource.Util.bytes(password);
		String newPassword = new SimpleHash(algorithmName, password,
				passwordSalt, hashIterations).toHex();

//		user.setPassword(newPassword);
		return newPassword;
	}

//	public String encryptPassword(StringBuilder password) {
//
//		String salt = randomNumberGenerator.nextBytes().toHex();
//
//		String newPassword = new SimpleHash(algorithmName, password.toString(),
//				salt, hashIterations).toHex();
//
//		password.delete(0, password.length());
//		password.append(newPassword);
//
//		return salt;
//	}

//	public Boolean verifyPassword(UserEntity user, String password) {
//		if (password == null) {
//			password = ""; //NOSONAR
//		}
//
//		String newPassword = new SimpleHash(algorithmName, password,
//				getSalt(user), hashIterations).toHex();
//
//		return user.getPassword().equals(newPassword);
//	}

//	public ByteSource getSalt(UserEntity user) {
//		return ByteSource.Util.bytes(user.getCredentialsSalt());
//	}
}
