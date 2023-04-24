
public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
    		
		int[][] arr1=rotateImage(arr);
		
		for(int x=0;x<arr1.length;x++) {
			for(int y=0;y<arr1.length;y++) {
				System.out.print(arr[x][y]);
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
	
	public static int[][] rotateImage(int[][] matrix){
		
		int length = matrix.length;
		int temp;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				temp = matrix[i][j];
				 matrix[i][j]=matrix[j][i];
				 System.out.println(i +" "+ j + "=" + matrix[j][i]);
				 matrix[j][i]=temp;
			}
		}
		
		return matrix;
	}

}
