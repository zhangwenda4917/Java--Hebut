package Function;

public class Function {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void compute(){
        for (int i = 0; i< 10; i++){
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    if (i*100 + j*10 + k + j*100 + k*10 + k == 532){
                        this.x = i;
                        this.y = j;
                        this.z = k;
                    }
                }
            }
        }
    }
}
