package com.company.other;

import java.lang.reflect.Array;

public class Find {
    public static void main(String[] args) {

    }
}

    /*
        A-B-C-E
           -D
          C和D的公共父视图是b，
          算法实现：搜索e、d的公共父视图
    * - (UIView *)find:(UIView *)cView superView:(UIView *)fView {
    if (cView == self.e){
        self.eView = fView;
        return self.e;
    } else if (cView == self.d){
        self.dView = fView;
        return self.d;
    }
    NSArray *array = cView.subviews;
    if (array.count == 0) {
        return NULL;
    }
    UIView *inview = NULL;
    for (UIView *sub in array) {
        inview = [self find:sub superView:cView];
        if (self.eView && self.eView==self.dView) {
            self.result = self.eView;
            return NULL;
        } else if (inview == self.e) {
            self.eView = cView;
        } else if (inview == self.d){
            self.dView = cView;
        }
    }
    return inview;
}
    *
    * */
