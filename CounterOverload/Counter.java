public class Counter {
    private int value;
    
    public Counter(){
    }
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value ++;
    }
    
    public void increase(int increaseBy){
        
        if(increaseBy > 0){
            this.value += increaseBy;
        }
    }
    
    
    public void decrease(){
        this.value--;
    }
    
    public void decrease(int decreaseBy){
        
        if(decreaseBy > 0){
            this.value -= decreaseBy;
        }
    }
    
}
