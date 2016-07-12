describe('Service: app.CourseFactory', function () {

    // load the service's module
    beforeEach(module('app'));

    // instantiate service
    var Course;
    var httpBackend;

    //update the injection
    beforeEach(inject(function (_Course_, _$httpBackend_) {
        Course = _Course_;
        httpBackend = _$httpBackend_;
    }));

    /**
     * @description
     * Sample test case to check if the service is injected properly
     * */
    it('should be injected and defined', function () {
        expect(Course).toBeDefined();
    });

    it('should get a course', function () {
        // given
        httpBackend.expectGET('/api/course/1')
            .respond({id: 1, name: 'name'});
        // when
        var course = Course.get({id:1});
        httpBackend.flush();
        // then
        expect(course).toBeDefined();
        expect(course.id).toBe(1);
        expect(course.name).toBe('name');
    })
});
