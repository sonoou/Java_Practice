public class MyArrayHelper{
	public static int[] input(){
		System.out.print("Enter the size of array: ");
		int n = new java.util.Scanner(System.in).nextInt();

		int a[]=new int[n];
		for(int i = 0; i < a.length; i++){
			System.out.print("Enter "+(i+1)+" element: ");
			a[i] = new java.util.Scanner(System.in).nextInt();
		}
		return a;
	}

	public static int[][] input2D(){
		int in = 1;
		System.out.print("Enter total no of array: ");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter the size of array: ");
		int s = new java.util.Scanner(System.in).nextInt();
		int a[][] = new int[n][s];
		for(int i = 0;i < a.length; i++){
			for(int j = 0; j<a[i].length; j++){
				System.out.print("Enter "+in+" element: ");
				a[i][j] = new java.util.Scanner(System.in).nextInt();
				in++;
			}
		}
		return a;
	}

	public static int[][] inputMatrix(){
		int in = 1;
		System.out.print("Enter row: ");
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter column: ");
		int s = new java.util.Scanner(System.in).nextInt();
		int a[][] = new int[n][s];
		for(int i = 0;i < a.length; i++){
			for(int j = 0;j < a[i].length; j++){
				System.out.print("Enter "+in+" element: ");
				a[i][j] = new java.util.Scanner(System.in).nextInt();
				in++;
			}
		}
		return a;
	}

	public static void print(int a[]){
		System.out.println();
		for(int i = 0; i < a.length; i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}

	public static void print(int a[], int endInd){
		System.out.println();
		for(int i = 0; i < endInd; i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}

	public static void print(char a[]){
		System.out.println();
		for(int i = 0; i < a.length; i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}

	public static void print2D(int a[][]){
		for(int i = 0;i < a.length; i++){
			System.out.println();
			for(int j= 0; j < a[i].length; j++){
				System.out.print(((a[i][j]>9)?" ":"  ")+a[i][j]);
			}
		}
		System.out.println("\n");
	}

	public static void print2DSameLine(int a[][], int b[][]){
		for(int i = 0; i < a.length; i++){
			System.out.println();
			for(int j = 0; j < a[i].length; j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.print("\t\t");
			for(int j = 0; j < b[i].length; j++){
				System.out.print(" "+b[i][j]);
			}
		}
		System.out.println("\n");
	}
}
