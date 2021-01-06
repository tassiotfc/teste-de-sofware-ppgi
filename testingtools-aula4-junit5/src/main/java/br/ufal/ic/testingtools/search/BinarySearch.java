package br.ufal.ic.testingtools.search;

public class BinarySearch {
	
	public int binarySearch(int v[], int element) {
		 int begin = 0;
		 int end = v.length - 1;
		 int middle;
		 while (begin <= end) {
			 middle = (begin + end) / 2;
			 if (v[middle] < element) {
				 begin = middle + 1;
			 } else if (v[middle] > element) {
				 end = middle - 1;
			 } else {
				 return middle;
			 }
		 }
		 return -1;
	}
}
