class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        if(i < this.capacity){
            this.arr[i] = n;
        }
    }

    public void pushback(int n) {
        if(this.size == capacity){
            this.resize();
        }
        arr[this.size++] = n;
    }

    public int popback() {
        return this.arr[--this.size];
    }

    public void resize() {
        this.capacity = 2 * this.capacity;
        int[] newArray = new int[this.capacity];

        for(int i = 0; i < this.arr.length; i++){
            newArray[i] = this.arr[i];
        }

        this.arr = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
