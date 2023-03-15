package telran.monitoring.model;

public class PulseProbe {

	public long patientId;
	public long timeStamp;
	public long sequenceNumber;
	public int value;
	
	public PulseProbe(long patientId, long timeStamp, long sequenceNumber, int value) {
		this.patientId = patientId;
		this.timeStamp = timeStamp;
		this.sequenceNumber = sequenceNumber;
		this.value = value;
	}

	@Override
	public String toString() {
		return "PulseProbe [patientId=" + patientId + ", timeStamp=" + timeStamp + ", sequenceNumber=" + sequenceNumber
				+ ", value=" + value + "]";
	}

	public PulseProbe() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PulseProbe other = (PulseProbe) obj;
		if (patientId != other.patientId)
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
}
