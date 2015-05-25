package com.baiing.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomXml {
	
	public static void main(String[] args) {
		DocumentBuilderFactory pdf = DocumentBuilderFactory.newInstance();
		try {//创建documentbuilder对象
			DocumentBuilder dom = pdf.newDocumentBuilder();
			//通过documentbuilder对象的parse的方法获取xml文件
			Document nodelist = dom.parse("guizhou.xml");
			//获取booklist的所有节点
			NodeList booklist = nodelist.getElementsByTagName("scene");
			
			System.out.println("一共有"+booklist.getLength()+"个场景");
			Map<Object,Object> map1 = new HashMap<Object, Object>();
			Map<Object,Object> map2 = new HashMap<Object, Object>();
			for(int i = 0;i<booklist.getLength();i++){
		
				Node node = booklist.item(i);
	
				NamedNodeMap attrmap = node.getAttributes();

				Element book = (Element) booklist.item(i);
			
				NodeList childnode = book.getChildNodes();
			
				System.out.println(childnode.getLength());
				
				for(int w = 0;w<childnode.getLength();w++){
					Node childxinxi = childnode.item(w);
					if(childnode.item(w).getNodeType()==Node.ELEMENT_NODE){
						System.out.println("元素名称"+childxinxi.getNodeName()+"     ："+"属性值:"+childxinxi.getFirstChild().getNodeValue());
						map1.put(childxinxi.getNodeName(), childxinxi.getFirstChild().getNodeValue());
					}
				}
				System.out.println(map1.toString());
				
				for(int j = 0;j<attrmap.getLength();j++){
					Node attrnode = attrmap.item(j);
					String name = attrnode.getNodeName();
					System.out.println("第"+(i+1)+"个场景一共有"+attrmap.getLength()+"个属性"+","+"属性名是"+name+"属性值"+attrnode.getNodeValue());
					map2.put(name, attrnode.getNodeValue());
				}
				System.out.println(map2.toString());
				Object type1 = map1.get("type");
				Object value = map1.get("value");
				Object type = map2.get("type");
				System.out.println(type+"_"+type1+"="+value);
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
