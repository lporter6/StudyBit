package Calendar;

/**
 * DescHolder holds Titles and Descriptions for assignments
 */

public class DescHolder {

    private String title; //holds the title of the assignment

    private String desc; //holds extra description of the assignment

    /**
     * @return returns the title of the object
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title is set to be the object's title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return returns the current desc of the object
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc is set to be the new desc of the object
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @param title is set to be the initial title of the object
     */
    public DescHolder(String title) {
        this.title = title;
    }

    /**
     * @param title is set to be the initial title
     * @param desc is set to be the initial description
     */
    public DescHolder(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}
