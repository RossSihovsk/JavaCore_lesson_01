public class lesson1 {

        public static void main(String[] args) {
            byte a=1;
            short b=2;
            int c=3;
            long d = 4;

            boolean e = true;
            char t = 'i';

            System.out.println(Byte.MAX_VALUE+" "+Byte.MIN_VALUE);
            System.out.println(Short.MAX_VALUE+" "+Short.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
            System.out.println(Long.MAX_VALUE+" "+Long.MIN_VALUE);
            System.out.println(Character.MAX_VALUE+" "+Character.MIN_VALUE);

            int arr[]  = new int[10];

            for(int i=0; i<10; i++) {
                arr[i]=i+i*2+1;

            }
            int	min=1;
            int max=1;

            for(int i = 0; i != arr.length; i ++){
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min =arr[i];
                }
            }


            System.out.println("min = "+min+"\nmax = "+max);

        }


    }


