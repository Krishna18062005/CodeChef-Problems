
private static void leftShiftUnitDigits(int arr[], int N) {
    int fd=arr[0];
    for(int i=0;i<N-1;i++){
        arr[i]=(arr[i]/10)*10+arr[i+1]%10;
    }arr[N-1]=(arr[N-1]/10)*10+fd%10;
}
