package cn.iocoder.mall.search.biz.service;


public interface ProductSearchService {

    Integer rebuild();

    /**
     * 构建商品的搜索索引
     *
     * @param id 商品编号
     * @return 构建结果
     */
    Boolean save(Integer id);
//
//    ProductPageBO getSearchPage(ProductSearchPageDTO searchPageDTO);
//
//    ProductConditionBO getSearchCondition(ProductConditionDTO conditionDTO);

}