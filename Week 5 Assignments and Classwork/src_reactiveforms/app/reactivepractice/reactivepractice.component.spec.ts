import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactivepracticeComponent } from './reactivepractice.component';

describe('ReactivepracticeComponent', () => {
  let component: ReactivepracticeComponent;
  let fixture: ComponentFixture<ReactivepracticeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ReactivepracticeComponent]
    });
    fixture = TestBed.createComponent(ReactivepracticeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
