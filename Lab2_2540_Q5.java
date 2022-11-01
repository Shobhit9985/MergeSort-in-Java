class Lab2_2540_Q5 {
    QNode front, rear;

    public Lab2_2540_Q5() {
        this.front = this.rear = null;
    }

    void enqueue(int key) {
        QNode temp = new QNode(key);

        if (this.rear == null) {

            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    public int dequeue()

    {

        if (this.front == null)
            return -99;

        int temp = this.front.key;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

        return temp;

    }

    public int getFirst() {

        QNode n = this.front;
        return n.key;
        // System.out.println("FirstElement:" + n.key);
    }

    public int size() {
        QNode node = this.front;
        int c = 1;
        while (node.next != null) {
            node = node.next;
            c++;
        }
        return c;
        // System.out.println("Size:" + c);
    }

    public boolean isEmpty() {
        if (this.front == null) {
            return true;
        } else {
            return false;
        }
    }

    public void show(QNode node) {
        node = this.front;
        while (node.next != null) {
            System.out.println(node.key);
            node = node.next;
        }
        System.out.println(node.key);
    }

}

// Both enque and deque is O(1) as there are no loops in them.