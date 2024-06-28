class Stack {
    int top = -1;
    int size = 0;
    int stArray[];

    public Stack(){
        this.size = 5;
        stArray = new int[size];
    }

    public Stack(int size){
        this.size = size;
        stArray = new int[size];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        return false;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("Stack is full.");
        }
        else{
            top +=1;
            stArray[top] = num;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is isEmpty");
        }
        else{
            top -= 1;
        }
    }

    public void getTop() {
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(stArray[top]);
        }
    }

}

class Program{
    public static void main(String[] args) {
        Stack st1 = new Stack(10);
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        
        st1.getTop();
        st1.pop();
        st1.getTop();
    }
}