 class Cart{
        private Items item;
        private int quantity;

        public Items getItem() {
            return item;
        }

        public void setItem(Items item) {
            this.item = item;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Cart(Items item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "CartItem{" +
                    "item=" + item +
                    ", quantity=" + quantity +
                    '}';
        }
    }
   

   
    

  