package PacketsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PacketProcessor {
	
			private static String _address = "127.0.0.1";
			
			public static List<Packet> initializePackets(){
			Packet a = new Packet(new Header("127.0.0.1", 3), 
				new Body(new String[]{"1","2","3"}));
			Packet b = new Packet(new Header("127.0.0.1", 2), 
				new Body(new String[]{"10","30"}));
			Packet c = new Packet(new Header("127.0.0.1", 3), 
				new Body(new String[]{"8","0","17"}));
			Packet d = new Packet(new Header("127.0.0.1", 2), 
				new Body(new String[]{"5","40"}));
			Packet e = new Packet(new Header("127.0.0.1", 3), 
				new Body(new String[]{"2","100","9"}));
			List<Packet> l = new ArrayList<>();
			l.add(a); 	l.add(b);
			l.add(c); 	l.add(d);
			l.add(e);
			return l;
	  }
			/*
			 * do the following
			 * check if the packet is yours
			 * check the checksum
			 * sort the elements in each packet
			 * print all elements 
			 */
			public static void main(String[] args) {
				List<Packet> packets = initializePackets();
				Stream<Packet> stream = packets.parallelStream().
					filter(p->p.getHeader().getAddress().equals(_address));
				stream = stream.filter(packet->packet.getHeader().getChecksum() == packet.getBody().getMerssage().length);
				stream.forEach(pack->Arrays.stream(pack.getBody().getMerssage()).
					sorted(( s1, s2)-> (Integer.parseInt(s1) - 
					Integer.parseInt(s2))).forEach(o->System.out.println(o)));
			}



}
