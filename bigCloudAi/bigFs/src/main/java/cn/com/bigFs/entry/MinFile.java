package cn.com.bigFs.entry;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class MinFile {
	
	
	@Id
	@GeneratedValue
	int minFileId;
	
  //小文件 --1mb
	int  minSize;
	
	//{0990901,192.5.4.1,192.5.4.2，192.5.4.4}
	Host host;
	
	String minName;
	
}
