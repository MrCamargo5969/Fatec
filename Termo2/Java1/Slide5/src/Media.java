public class Media {
    public float sum;
    public float count;

    public void Mean(){
        sum = 0;
        count = 0;
    }

    public void added(float i){
        sum += i;
        count++;
    }

    public float currentMean(){
        return sum/count;
    }
}


