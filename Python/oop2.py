class Date:
    def get_date(self):
        return '2022-02-10'


class Time(Date):
    def get_time(self):
        return '13:16:00'


dt = Date()
print('Get Date From Date Class ', dt.get_date())

tm = Time()
print('Get Time From Time Class ', tm.get_time())
print('Get Date From Time Class ', tm.get_date())
