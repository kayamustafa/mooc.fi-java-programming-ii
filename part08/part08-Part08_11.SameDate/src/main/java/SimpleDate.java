
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.getDay() + "." + this.getMonth() + "." + this.getYear();
    }

    public boolean earlier(SimpleDate other) {
        if (this.getYear() < other.getYear()) {
            return true;
        }

        if (this.getYear() == other.getYear()
                && this.getMonth() < other.getMonth()) {
            return true;
        }

        if (this.getYear() == other.getYear()
                && this.getMonth() == other.getMonth()
                && this.getDay() < other.getDay()) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.getMonth() < other.getMonth()) {
            yearRemoved = 1;
        } else if (this.getMonth() == other.getMonth() && this.getDay() < other.getDay()) {
            yearRemoved = 1;
        }

        return this.getYear() - other.getYear() - yearRemoved;
    }
    
    @Override
    public boolean equals(Object object){
        if(!(object instanceof SimpleDate)) return false;
        SimpleDate compare = (SimpleDate) object;
        if(this.getDay() == compare.getDay() && this.getMonth() == compare.getMonth() 
                && this.getYear() == compare.getYear()) {
            return true;
        } 
        return false;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

}
