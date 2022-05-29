package com.namelessmc.java_api;

public class Notification {

	private final String message;
	private final String url;
	private final Type type;

	public Notification(final String message, final String url, final Type type) {
		this.message = message;
		this.url = url;
		this.type = type;
	}

	public String message() {
		return this.message;
	}

	public String url() {
		return this.url;
	}

	public Type type() {
		return this.type;
	}

	public enum Type {

		TAG,
		MESSAGE,
		LIKE,
		PROFILE_COMMENT,
		COMMENT_REPLY,
		THREAD_REPLY,
		FOLLOW,

		UNKNOWN;

		public static Type fromString(final String string) {
			try {
				return Type.valueOf(string.replace('-', '_').toUpperCase());
			} catch (final IllegalArgumentException e) {
				return Type.UNKNOWN;
			}
		}

	}

}
