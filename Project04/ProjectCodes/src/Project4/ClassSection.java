package Project4;

/**
 * A class section consists of a unique class number, a course subject, a catalog number, a class title, and a level.
 * @author H9
 * @version 1.0
 */
public class ClassSection implements Comparable<ClassSection> {
	// Class Number
	private String classNumber;
	// Course Subject
	private String subject;
	// Catalog Number
	private String catalogNumber;
	// Class Title
	private String title;
	// Level
	private String level;
	
	public ClassSection(String number1, String subject, String number2, String title, String level)
	{
		this.classNumber = number1;
		this.subject = subject;
		this.catalogNumber = number2;
		this.title = title;
		this.level = level;
	}

	public ClassSection() {
		this(null, null, null, null, null);
	}

	/**
	 * Get class number of class section
	 * @return class number
	 */
	public String getClassNumber() {
		return classNumber;
	}
	
	/**
	 * Set class number of class section
	 */
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	/**
	 * Get subject of class section
	 * @return subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Set subjecct of class section
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Get catalog number of class section
	 * @return catalog number
	 */
	public String getCatalogNumber() {
		return catalogNumber;
	}

	/**
	 * Set catalog number of class section
	 */
	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
	
	/**
	 * Get title of class section
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Get level of class section
	 * @return level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Set level of class section
	 * @return level
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
    public int compareTo(ClassSection classSection) {
        return Integer.parseInt(this.getClassNumber()) - Integer.parseInt(classSection.getClassNumber());
    }
	
	@Override
    public String toString() 
	{
        return "classNumber:" + this.classNumber
        		+ ", subject:" + this.subject
        		+ ", catalogNumber:" + this.catalogNumber
        		+ ", title:" + this.title
        		+ ", level:" + this.level;
	}

	@Override
	public boolean equals(Object obj) 
	{
        if(this == obj)
        {   
            return true;
        }
 
        if(obj instanceof ClassSection)
        {
        	ClassSection cust = (ClassSection) obj;
            if(this.classNumber.equals(cust.classNumber))
            {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
