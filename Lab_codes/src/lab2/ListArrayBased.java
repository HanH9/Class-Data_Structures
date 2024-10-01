package lab2;

import java.util.Arrays;

/**
 * Implementations of operations of an ADT list.
 * @author H9
 * @version 1.0
 *
 */
public class ListArrayBased implements ListInterface{
    private Object[] elementData;
    private final static Object[] EmptyArray = {};
    private int size = 0;

    //无参数构造方法
    public ListArrayBased() {
        this.elementData = EmptyArray;
    }

    //带参数构造函数
    public ListArrayBased(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("参数不能小于0");
        }
        this.elementData = new Object[length];
    }

	 /**
	  * Determines whether a list is empty. 
	  * @return A boolean value specifying if this list is empty or not
	  */
	  public boolean isEmpty(){
		  return this.size() == 0;
	  }
	  
	  /**
	   * Returns the length of a list. 
	   * @return An integer specifying the length of a list
	   */
	  public int size(){
		 return this.size;
	  }
	  
	  	//添加元素
	    public void add(Object args) {
	        //每次添加元素时需要考虑长度问题
	        //判断是否需要扩容
	        if (size >= elementData.length) {
	            this.grown();
	        }
	        elementData[size++] = args;
	    }

	    //扩容方法
	    private void grown() {
	        //if (elementData.length <= 1) {
	            elementData = Arrays.copyOf(elementData, elementData.length + 1);
	        //} else {
	        //    elementData = Arrays.copyOf(elementData, elementData.length + (elementData.length >> 1));
	        //}
	        //System.out.println(elementData.length);
	    }

	    //删除元素
	    public void remove(Object obj) {
	        //先查找第一次出现的索引
	        int i = indexOf(obj);
	        if (i != -1) {
	            remove(i);
	        }
	    }

	    //删除指定索引位置元素
	    public void remove(int index) throws ListIndexOutOfBoundsException, ListException {
	    	if(this.size() == 0){
				  throw new ListException("The list is empty, and no elements can be removed.");
	    	}
			else if (index < 0 || index > size) {
	            throw new IndexOutOfBoundsException("参数越界");
	        }
	        //遍历数组
	        //for(int i = index;i<elementData.length;i++){
	        //    elementData[i]=elementData[i+1];
	        //}
	        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
	        size--;
	    }

	    //指定索引插入元素
	    public void add(int index, Object obj) throws ListIndexOutOfBoundsException {
	        if (index < 0 || index > size) {
	            throw new IndexOutOfBoundsException("参数越界");
	        }
	        
	        if (size >= elementData.length) {
	            this.grown();
	        }
	        
	        //遍历数组
	        for (int i = size - 1; i >= index; i--) {
	            elementData[i + 1] = elementData[i];
	        }
	        //将需要插入元素放入指定索引位置
	        elementData[index] = obj;
	        size++;
	    }
	    
	    //查找元素第一次索引
	    public int indexOf(Object obj) {
	        for (int i = 0; i < size; i++) {
	            if (elementData[i] == obj || elementData[i] != null && elementData[i].equals(obj)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public Object get(int index) throws ListIndexOutOfBoundsException, ListException{
			  if(this.size() == 0){
				  throw new ListException("The list is empty, and no elements can be removed.");
			  }else if(index < 0 || index > this.size()){
				  throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.size()-1));
			  }else{
				  // return an items at index from this list.
				  return this.elementData[index];
			  }
			  
		  }
}
