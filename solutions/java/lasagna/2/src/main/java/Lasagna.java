public class Lasagna {
    public int expectedMinutesInOven(){
        int x = 40;
        return x;
    }
    public int remainingMinutesInOven(int x){
        int y = expectedMinutesInOven();
        
        return y-x;
    }
    public int preparationTimeInMinutes(int x){
        x = x*2;
        return x;
    }
    public int totalTimeInMinutes(int x, int y){
        int w = preparationTimeInMinutes(x);
        return w+y;
    }
}
