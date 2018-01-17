package PacketsExample;

public class Packet {
	private Header _header;
	private Body _body;
	public Packet(Header header, Body body) {
		super();
		this._header = header;
		this._body = body;
	}
	public Header getHeader() { return _header;}
	public Body getBody() {return _body;}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_header == null) ? 0 :
		 _header.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Packet other = (Packet) obj;
		if (_header == null) {
			if (other._header != null)
				return false;
		} else if (!_header.equals(other._header))
			return false;
		return true;
	}


}
