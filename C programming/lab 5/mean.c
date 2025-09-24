// find the mean and standard deviation of a set of numbers.
// 2.write a program to read 10 integer numbersi n an array and print only the even numbers

#include <stdio.h>
#include <math.h>

float calculateMean(float arr[], int n) {
	float sum = 0.0;
	for (int i = 0; i < n; i++) {
		sum += arr[i];
	}
	return sum / n;
}

float calculateStdDev(float arr[], int n, float mean) {
	float sumSq = 0.0;
	for (int i = 0; i < n; i++) {
		sumSq += (arr[i] - mean) * (arr[i] - mean);
	}
	return sqrt(sumSq / n);
}

int main() {
	int n;
	printf("Enter the number of elements: ");
	scanf("%d", &n);
	float arr[n];
	printf("Enter %d numbers:\n", n);
	for (int i = 0; i < n; i++) {
		scanf("%f", &arr[i]);
	}
	float mean = calculateMean(arr, n);
	float stddev = calculateStdDev(arr, n, mean);
	printf("Mean = %.2f\n", mean);
	printf("Standard Deviation = %.2f\n", stddev);
	return 0;
}