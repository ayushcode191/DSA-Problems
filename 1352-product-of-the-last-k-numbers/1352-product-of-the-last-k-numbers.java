class ProductOfNumbers {
    List<Integer> list;
    List<Integer> prefixProduct;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1);
    }
    
    public void add(int num) {
        list.add(num);
        if (num == 0) {
            prefixProduct = new ArrayList<>();
            prefixProduct.add(1);
        } 
        else{
            int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(lastProduct * num);
        }
    }
    
    public int getProduct(int k) {
        int size = prefixProduct.size();
        if (k >= size){
            return 0;
        }
        return prefixProduct.get(size - 1) / prefixProduct.get(size - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */