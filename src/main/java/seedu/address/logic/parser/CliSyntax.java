package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */

    public static final Prefix PREFIX_NAME = new Prefix("--name ");
    public static final Prefix PREFIX_PHONE = new Prefix("--phone ");
    public static final Prefix PREFIX_EMAIL = new Prefix("--email ");
    public static final Prefix PREFIX_LOCATION = new Prefix("--location ");
    public static final Prefix PREFIX_REMARK = new Prefix("--remark ");
    public static final Prefix PREFIX_NAME_SHORT = new Prefix("-n ");
    public static final Prefix PREFIX_PHONE_SHORT = new Prefix("-p ");
    public static final Prefix PREFIX_EMAIL_SHORT = new Prefix("-e ");
    public static final Prefix PREFIX_LOCATION_SHORT = new Prefix("-l ");
    public static final Prefix PREFIX_REMARK_SHORT = new Prefix("-r ");

}
