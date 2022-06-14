import util;
class practice_2 {
    public static void main(String[] args)
    {

        System.out.println("Hello");
        System.out.println("how many numbers do you want ?");
        String n = new Scanner(System.in).nextLine();
        int count = Integer.parseInt(n);
        int[] numbers = new int[count];
        for (int x = 0; x < count; x++)
        {
            System.out.println("write your " + (x + 1) + " number :");
            String num = new Scanner(System.in).nextLine();
            int intNum = Integer.parseInt(num);
            numbers[x] = intNum;
        }
        int max =0;
        for (int counter = 1; counter < numbers.length; counter++)
        {
            if (numbers[counter] > max)
            {
                max = numbers[counter];
            }
        }
        System.out.println("highest number in array is : " + max);
    }
}

