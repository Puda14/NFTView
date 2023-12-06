package org.nftview;

public class NftCSV implements INftCSV{
    private NFT[] list = new NFT[9];

    public NftCSV(){
        list[0] = new NFT("OK0","VietNam");
        list[1] = new NFT("OK1","ThaiLan");
        list[2] = new NFT("OK2","America");
        list[3] = new NFT("OK3","Laos");
        list[4] = new NFT("OK4","Indonesia");
        list[5] = new NFT("OK5","England");
        list[6] = new NFT("OK6","Korea");
        list[7] = new NFT("OK7","Japan");
        list[8] = new NFT("OK9","China");
    }
    @Override
    public NFT[] getAllNft(){
        return list;
    }
}
