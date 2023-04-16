package toSum;

public class Sum {
    int x;
    int y;
	public int result;

    public Sum(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int suma(){
        result = x + y;
        return result;
    }
}
