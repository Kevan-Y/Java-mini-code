package locker;

public class ComboLock {
    //Instance Variable
    private int code1;
    private int code2;
    private int code3;

    //Default Constructor
    public ComboLock() {
        this.code1 = 0;
        this.code2 = 0;
        this.code3 = 0;
    }

    //Constructor
    public ComboLock(int code1, int code2, int code3) {
        this.code1 = code1;
        this.code2 = code2;
        this.code3 = code3;
    }

    //getCode1 Method
    public int getCode1() {
        return code1;
    }

    //getCode2 Method
    public int getCode2() {
        return code2;
    }

    //getCode3 Method
    public int getCode3() {
        return code3;
    }

    //setCode1 Method
    public void setCode1(int code1) {
        this.code1 = code1;
    }

    //setCode2 Method
    public void setCode2(int code2) {
        this.code2 = code2;
    }

    //setCode3 Method
    public void setCode3(int code3) {
        this.code3 = code3;
    }

    //checkLock Method
    public boolean checkLock(int code1, int code2, int code3) {
        return this.code1 == code1 && this.code2 == code2 && this.code3 == code3;
    }
}//End Class