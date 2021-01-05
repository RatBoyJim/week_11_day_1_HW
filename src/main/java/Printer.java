public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets){
        this.sheets = sheets;
        this.toner = 100;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int[] printDocument(int pages, int copies) {
        if (this.sheets > pages * copies) {
            this.sheets -= pages * copies;
            this.toner -= pages * copies;
            int arr[] = new int[2];
            arr[0] = this.sheets;
            arr[1] = this.toner;
            return arr;
        }else{
            int arr[] = new int[2];
            arr[0] = this.sheets;
            arr[1] = this.toner;
            return arr;
        }
    }

    public int getTonerVolume() {
        return this.toner;
    }
}
