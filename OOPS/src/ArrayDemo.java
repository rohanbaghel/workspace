
public class ArrayDemo {

	public static void main(String[] args){
		int [][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
		matrix[0][0]=0;
		System.out.println(matrix.length+" "+matrix[0].length);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				matrix[i][j]=i*j;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
