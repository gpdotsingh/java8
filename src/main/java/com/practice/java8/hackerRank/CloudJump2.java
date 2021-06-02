package com.practice.java8.hackerRank;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class CloudJump2 {
    public static void main(String[] args) {
        int [] cloud = {0,0,1,0,0};

        AtomicInteger currCloudIndex = new AtomicInteger();
        AtomicInteger jump = new AtomicInteger();

        IntStream.range(0,cloud.length)
                .forEach(index->{
                    if(index==currCloudIndex.get()
                    && currCloudIndex.get()+1<cloud.length)
                    {
                        if(currCloudIndex.get()+2< cloud.length
                        && cloud[currCloudIndex.get()+2] == 0)
                        {
                            currCloudIndex.addAndGet(2);

                        }
                        else {
                            currCloudIndex.addAndGet(1);
                        }
                        jump.incrementAndGet();
                    }
                });

    }


}
