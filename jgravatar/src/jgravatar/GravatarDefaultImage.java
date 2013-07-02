package jgravatar;

public enum GravatarDefaultImage {

	GRAVATAR_ICON(""),

	MYSTERY_MAN("mm"),

	RETRO("retro"),

	IDENTICON("identicon"),

	MONSTERID("monsterid"),

	WAVATAR("wavatar"),

	BLANK("blank"),

	HTTP_404("404");

	private String code;

	private GravatarDefaultImage(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
