package org.nftview;

public class NFT {
    private String name;
    private String info;
    private String imageLink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public NFT(String name, String info){
        this.name = name;
        this.info = info;
    }

    public NFT(String name, String info, String imageLink){
        this.name = name;
        this.info = info;
        this.imageLink = imageLink;
    }
}
