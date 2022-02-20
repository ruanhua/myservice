package com.cn.myservice.suanfa;


import java.util.HashMap;
import java.util.Random;

public class RandowPoolHash<K> {
    private HashMap <K,Integer> keyIndexMap;
    private HashMap <Integer,K> indexKeyMap;
    private int size;

    public RandowPoolHash(){
        this.size = 0;
        keyIndexMap = new HashMap<>(16);
        indexKeyMap = new HashMap<>(16);
    }

    public void insert(K key){
        if(!keyIndexMap.containsKey(key)){
            keyIndexMap.put(key,size);
            indexKeyMap.put(size,key);
            size ++;
        }
    }

    public void delete(K key){
        if(keyIndexMap.containsKey(key)){
            int delIndex = keyIndexMap.get(key);
            int lastIndex = --this.size;
            K lastKey = indexKeyMap.get(lastIndex);
            this.keyIndexMap.put(lastKey,delIndex);
            this.indexKeyMap.put(delIndex,lastKey);
            this.keyIndexMap.remove(lastKey);
            this.indexKeyMap.remove(lastIndex);
        }
    }

    public K getRandom(){
        if(this.size == 0){
            return null;
        }
        int randomIndex = (int)(Math.random()*this.size);
        System.out.println(randomIndex);
        return indexKeyMap.get(randomIndex);
    }

    public static void main(String[] args){
        RandowPoolHash<String> poolHash = new RandowPoolHash<String>();
        poolHash.insert("aaa");
        poolHash.insert("bbb");
        poolHash.insert("ccc");
        System.out.println(poolHash.getRandom());
    }

}
