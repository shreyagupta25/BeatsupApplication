package com.example.demo.entities;

public class Concertdummy {
	
		String description;
		int concertid,eventid,totaltickets,price,artid;
		public Concertdummy() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public int getArtid() {
			return artid;
		}



		public void setArtid(int artid) {
			this.artid = artid;
		}



		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getConcertid() {
			return concertid;
		}
		public void setConcertid(int concertid) {
			this.concertid = concertid;
		}
		public int getEventid() {
			return eventid;
		}
		public void setEventid(int eventid) {
			this.eventid = eventid;
		}
		public int getTotaltickets() {
			return totaltickets;
		}
		public void setTotaltickets(int totaltickets) {
			this.totaltickets = totaltickets;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}



		@Override
		public String toString() {
			return "Concertdummy [description=" + description + ", concertid=" + concertid + ", eventid=" + eventid
					+ ", totaltickets=" + totaltickets + ", price=" + price + ", artid=" + artid + "]";
		}
		
		
		
			

}
