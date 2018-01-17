package PacketsExample;

public class Header {
	private String _address;
	private int _checksum;
	private int _seq;

	public Header(String address, int checksum) {
		super();
		this._address = address;
		this._checksum = checksum;
		_seq++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_address == null) ? 0 : _address.hashCode());
		result = prime * result + _seq;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Header other = (Header) obj;
		if (_address == null) {
			if (other._address != null)
				return false;
		} else if (!_address.equals(other._address))
			return false;
		if (_seq != other._seq)
			return false;
		return true;
	}
	
	public String getAddress() { return _address;}
	public void setAddress(String address) {
		this._address = address;
	}
	public int getChecksum() {return _checksum;}
	public void setChecksum(int checksum) {
		this._checksum = checksum;
	}
	public int getSeq() {return _seq; }
	public void setSeq(int seq) { this._seq = seq; }



}
