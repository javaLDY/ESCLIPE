package com.baiing.action;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomTest {

	public static void main(String[] args) {
		
		DocumentBuilderFactory pdf = DocumentBuilderFactory.newInstance();
		try {//创建documentbuilder对象
			DocumentBuilder dom = pdf.newDocumentBuilder();
			//通过documentbuilder对象的parse的方法获取xml文件
			Document nodelist = dom.parse("bookstore.xml");
			//获取booklist的所有节点
			NodeList booklist = nodelist.getElementsByTagName("book");
			
			System.out.println("一共有"+booklist.getLength()+"书");
			
			for(int i = 0;i<booklist.getLength();i++){
				//通过item方法获取booklist的第一个节点
				Node node = booklist.item(i);
				//获取书的所有属性
				NamedNodeMap attrmap = node.getAttributes();
				
				System.out.println("第"+(i+1)+"本书一共有"+attrmap.getLength()+"个属性");
				//通过element获取book里面的元素
				Element book = (Element) booklist.item(i);
				//在通过getChildNodes方法将book里面的子元素获取
				NodeList childnode = book.getChildNodes();
				//这个是一共有几个人元素这里面一定要注意它的元素个数不是按自己想的那样是三个从头来到后数
				System.out.println(childnode.getLength());
				for(int w = 0;w<childnode.getLength();w++){
					Node childxinxi = childnode.item(w);
					if(childnode.item(w).getNodeType()==Node.ELEMENT_NODE){
						System.out.println("元素名称"+childxinxi.getNodeName()+"     ："+"属性值:"+childxinxi.getFirstChild().getNodeValue());
					}
				}
				for(int j = 0;j<attrmap.getLength();j++){
					Node attrnode = attrmap.item(j);
					String name = attrnode.getNodeName();
					System.out.println("第"+(i+1)+"本书一共有"+attrmap.getLength()+"个属性"+","+"属性名是"+name+"属性值"+attrnode.getNodeValue());
				}
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
