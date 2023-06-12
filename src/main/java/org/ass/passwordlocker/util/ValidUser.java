package org.ass.passwordlocker.util;

import org.ass.passwordlocker.entity.User;

public class ValidUser {
private static User user;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}


}
