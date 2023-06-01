public class Question4 {
    
        public boolean canPlaceFlowers(int[]flowerbed, int n) {
            if (n == 0) {
                return true;
            }
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int[]flowerbed={1,0,0,0,1};
            int n=1;
            Question4 plant=new Question4();
            System.out.println(plant.canPlaceFlowers(flowerbed, n));
        }
    }

