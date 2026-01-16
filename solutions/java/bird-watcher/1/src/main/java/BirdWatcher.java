
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeeksBirds = {0, 2, 5, 3, 7, 8, 4};
        return lastWeeksBirds;
    }

    public int getToday() {
        int length = birdsPerDay.length;
        int todayBird = birdsPerDay[length - 1];
        return todayBird;
    }
        

    public void incrementTodaysCount() {
        int lastIndex = birdsPerDay.length - 1; 
        birdsPerDay[lastIndex]= birdsPerDay[lastIndex]+1; 
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: birdsPerDay){
            if(birds == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int firstDays = 0;
        int lastIndex = birdsPerDay.length -1;
        for (int i = 0; i < numberOfDays && i <= lastIndex; i++){
            firstDays += birdsPerDay[i];
            System.out.println(firstDays);
        }
        return firstDays;
    }

    public int getBusyDays() {
        int count = 0;
        for (int birds: birdsPerDay){
            if(birds >= 5){
                count++;
            }
        }
        return count;
    }
}
