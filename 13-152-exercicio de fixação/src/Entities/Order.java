package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {

		
		private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		private Date moment;
		private OrderStatus status;
		
		private Client client; //instanciar cliente pq precisa de uma conexão?
		private List<OrderItem> items = new ArrayList<>(); //pq ter essa lista
		
		public Order(Date moment, OrderStatus status, Client client) {
			super();
			this.moment = moment;
			this.status = status;
			this.client = client;
		}
		public Date getMoment() {
			return moment;
		}
		public void setMoment(Date moment) {
			this.moment = moment;
		}
		public OrderStatus getStatus() {
			return status;
		}
		public void setStatus(OrderStatus status) {
			this.status = status;
		}
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
		
		
		
}
