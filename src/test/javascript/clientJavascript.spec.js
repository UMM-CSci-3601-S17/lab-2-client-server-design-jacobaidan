// Just some example testing.

describe('testing basic functions', function(){
    // it('should return the correct string length', function(){
    //     expect(testStringLength("kittens")).toEqual(7);
    // });
    it('should return the correct url', function() {
        expect(buildURL("","","","")).toEqual("/api/todos?" + "limit="  + "&status=" + "&contains=");
    });

    it('should return the correct url', function() {
        expect(buildURL("58895985ae3b752b124e7663","","complete","")).toEqual("/api/todos/" + "58895985ae3b752b124e7663");
    });

    it('should return the correct url', function() {
        expect(buildURL("","10","incomplete","")).toEqual("/api/todos?" + "limit="  + 10 + "&status=" + "incomplete" + "&contains=");
    });

    it('should return the correct url', function() {
        expect(buildURL("","","complete","banana")).toEqual("/api/todos?" + "limit="  + "&status=" + "complete" + "&contains=" + "banana");
    });

    it('should return the correct url', function() {
        expect(buildURL("","11","complete","banana")).toEqual("/api/todos?" + "limit=" + 11  + "&status=" + "complete" + "&contains=" + "banana");
    });

});
