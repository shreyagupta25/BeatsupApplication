package com.example.demo.entities;

public class ArtistReqdummy {
	
		int artid,eventid,status,commercial;

		public int getArtid() {
			return artid;
		}

		public void setArtid(int artid) {
			this.artid = artid;
		}

		public int getEventid() {
			return eventid;
		}

		public void setEventid(int eventid) {
			this.eventid = eventid;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getCommercial() {
			return commercial;
		}

		public void setCommercial(int commercial) {
			this.commercial = commercial;
		}

		@Override
		public String toString() {
			return "ArtistReqdummy [artid=" + artid + ", eventid=" + eventid + ", status=" + status + ", commercial="
					+ commercial + "]";
		}
		
		
	

}
